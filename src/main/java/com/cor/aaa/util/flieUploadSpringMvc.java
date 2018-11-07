package com.cor.aaa.util;

import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

/**
 * spring-mvc文件上传
 * 
 * @author 范博源
 * 
 */
public class flieUploadSpringMvc {
	/**
	 * 多文件上传
	 * 
	 * @param files
	 *            上传的文件数组
	 * @param fileNames
	 *            上传的文件名称数组（与文件数组对应）
	 * @param path
	 *            文件上传的路径
	 * @return
	 */
	public static String[] fileUploads(MultipartFile[] files,
			String[] fileNames, String path) {
		try {
			// 上传文件
			for (int i = 0; i < files.length; i++) {
				String originalFilename = files[i].getOriginalFilename();
				//判断文件是否存在
				if (!originalFilename.equals("")) {
					String newFileName = originalFilename
							.substring(originalFilename.lastIndexOf("."));
					if (null != fileNames[i] && fileNames[i] != "") {
						newFileName = fileNames[i] + newFileName;
					} else {
						newFileName = UUID.randomUUID().toString()
								+ newFileName;
					}
					fileNames[i] = newFileName;
					path = ResourceUtils.getURL(path).getPath() + "\\" + newFileName;
					File saveFile = new File(path);
					files[i].transferTo(saveFile);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileNames;
	}

	/**
	 * 单文件上传
	 * 
	 * @param file
	 *            上传的文件
	 * @param oldPath
	 *            要删除的文件
	 * @param path
	 *            上传的文件路径
	 * @return
	 */
	public static String fileUpload(MultipartFile file, String oldPath,
			String path) {
		try {
			// 上传文件
			String originalFilename = file.getOriginalFilename();
			if (!originalFilename.equals("")) {
				String newFileName = UUID.randomUUID().toString()+originalFilename
						.substring(originalFilename.lastIndexOf("."));
				path = ResourceUtils.getURL(path).getPath() + "\\" + newFileName;
				File saveFile = new File(path);
				file.transferTo(saveFile);
				if (null != oldPath && oldPath != "") {
					File file2 = new File(oldPath);
					file2.delete();
				}
				return newFileName;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 不指定名称单文件上传
	 * 
	 * @param file
	 * @param path
	 * @return
	 */
	public static String fileUpload(MultipartFile file, String path) {
		return fileUpload(file, null, path);
	}
}
