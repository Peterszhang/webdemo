<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
 <s:updownselect name="books2" label="请选择您喜欢的图书" labelposition="top"
		    moveUpLabel="向上移动"  moveDownLabel="向下移动" selectAllLabel="全选"
		    list="parameters.list"/>
templateDir=${templateDir}<br>
theme=${theme}<br>
template=${template}<br>
模板路径=/${templateDir}/${theme}/${template}
