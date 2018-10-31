//机构信息数据
var orgData;
var manData;
//保存创建机构信息下拉框时的html结构
var orgSelectHtml = "";

/**
 * 创建机构信息下拉框
 * @param obj 要放入的控件中
 */
function foundOrgSelect(obj) {
    orgSelectHtml = "";
    foundOrgSelects(1, 1);
    $(obj).html(foundCurrentOrgSelect(1)+orgSelectHtml);
}

/**
 * 创建一个当前机构的下拉框
 */
function foundCurrentOrgSelect(orgId) {
    var html="<select>"
    for (var i = 0; i < orgData.length; i++) {
        if (orgData[i].orgId == orgId) {
            html += "<option value='" + orgData[i].orgId + "' selected>" + orgData[i].orgName + "</option></select>&nbsp;&nbsp;";
            return html;
        }
    }

}
/**
 * 使用递归创建机构信息下拉框
 * @param orgId 当前用户机构的Id
 * @param grade 机构的级别(传入1)
 */
function foundOrgSelects(orgId, grade) {
    if (orgData.length > 0) {
        orgSelectHtml += "<select class='select' onchange='orgSelectChange(this)' grade='" + grade + "'><option value='0'>全部</option>";
        if (grade <= 1) {
            for (var i = 0; i < orgData.length; i++) {
                if (orgData[i].superiorOrg == orgId) {
                    orgSelectHtml += "<option value='" + orgData[i].orgId + "' >" + orgData[i].orgName + "</option>";
                }
            }
        }
        orgSelectHtml += "</select>&nbsp;&nbsp;";
        for (var i = 0; i < orgData.length; i++) {
            if (orgData[i].superiorOrg == orgId && null != orgData[i].subOrgs && orgData[i].subOrgs.length > 0) {
                foundOrgSelects(orgData[i].orgId, ++grade);
                break;
            }
        }
    }
}

/**
 * 机构信息下拉框选择事件
 * @param obj 当前机构信息下拉框
 */
function orgSelectChange(obj) {
    var seHtml = "<option>全部</option>";
    var grade = parseInt($(obj).attr("grade"));
    var orgId = $(obj).val();
    for (var i = 0; i < orgData.length; i++) {
        if (orgData[i].superiorOrg == orgId) {
            seHtml += "<option value='" + orgData[i].orgId + "'>" + orgData[i].orgName + "</option>";
        }
    }
    $(obj).nextAll().html("<option value='0'>全部</option>");
    $(obj).next().html(seHtml);
    getOrgId(obj);
}

/**
 * 机构信息下拉框选择时根据选择的进行搜索
 * @param obj
 */
function getOrgSelectText(obj) {
    var seHtml = "<option>全部</option>";
    var grade = parseInt($(obj).attr("grade"));
    var orgId = $(obj).val();
    for (var i = 0; i < orgData.length; i++) {
        if (orgData[i].superiorOrg == orgId) {
            seHtml += "<option value='" + orgData[i].orgId + "'>" + orgData[i].orgName + "</option>";
        }
    }
    $(obj).nextAll().html("<option>全部</option>");
    $(obj).next().html(seHtml);
    var SelectText=$(obj).find("option:selected").text();
    if(SelectText=="全部"){
        SelectText=$(obj).prev().find("option:selected").text();
    }
    selectOrgDataTable(SelectText);
}

/**
 * 根据选择的部门，给表单中的选项赋值
 * @param obj
 */
function getOrgId(obj) {
    var SelectText=$(obj).find("option:selected").text();
    var orgIdInput=$(obj).parents("form").find(":input[name='orgId']");
    if(SelectText=="全部"){
        orgIdInput.val($(obj).prev().find("option:selected").val());
    }else {
        orgIdInput.val($(obj).find("option:selected").val());
    }
}
/**
 * 获取数据库中的机构信息
 */
function getOrgData() {
    $.ajax({
        url: basePath+"/org/queryAllOrg",
        type: "post",
        dataJson: "json",
        async: false,
        success: function (data) {
            orgData = data.aaData;
        }
    });
}
