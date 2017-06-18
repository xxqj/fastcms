package com.fast.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fast.common.constants.CommonConstant;
import com.fast.common.dao.Identifiable;
import com.fast.common.exception.ServiceException;
import com.fast.common.model.Resource;
import com.fast.common.service.IBaseService;
import com.fast.common.service.IResourceService;
import com.fast.web.controller.impl.BaseCurdControllerImpl;
import com.fast.web.model.ResourceVo;
import com.fast.web.model.Result;
import com.fast.web.model.Result.Status;



/**  
 * @Title: ResourceController.java
 * @Package com.fast.web.controller
 * @Description: 菜单资源控制器
 * @author 喧嚣求静
 * @date 2016-5-8
 * blog:913.iteye.com
 */

@Controller
@RequestMapping("/admin")
public class ResourceController extends BaseCurdControllerImpl<Resource, ResourceVo>{
	
	private static final Logger logger = Logger.getLogger(ResourceController.class.getName());
	
	@Autowired
	private IResourceService resourceService;
	
	

	/* (non-Javadoc)
	 * @see com.fast.web.controller.impl.BaseCurdControllerImpl#getBaseService()
	 */
	@Override
	protected IBaseService<Resource> getBaseService() {
		// TODO Auto-generated method stub
		return resourceService;
	}
	
	
	

	@RequestMapping(value = "/getResource.do", method = RequestMethod.GET)
	@ResponseBody
	public Result getResourceById(@PathVariable("fid") String fid) {
		//Object obj = getBaseService().queryById(id);
		Result rs=new Result();
		if (StringUtils.isEmpty(fid)) {
			logger.error("查询ID为null对象");
			return new Result(Status.ERROR, "查询ID为null！");
		}
		
		Resource res= resourceService.queryById(fid);
		rs.setData(res);
		if(res==null){
			rs.addError(CommonConstant.QRY_FAIL);
		}else{
			rs.addOK(CommonConstant.QRY_SUCCESS);
		}
		
		  
		return rs;
	}
	
	
	
	
	@RequestMapping(value = "/addResource.do")
	@ResponseBody
	public Result addResource(HttpServletRequest request,
                              HttpServletResponse response, HttpSession session)
	{
		  Result rs=new Result();
		  HttpServletRequest req=(HttpServletRequest) request;
		  
		  String functionName=req.getParameter("functionName");
		  String functionUrl=req.getParameter("functionUrl");
		  String functionDesc=req.getParameter("functionDesc");
		  String pid= req.getParameter("pid");
		  String postion= req.getParameter("postion");
		  String fid= req.getParameter("fid");
		  
		  Assert.notNull(functionName);
		  Assert.notNull(functionUrl);
		  Assert.notNull(pid);
		  
		  Resource entity=new Resource();
		  entity.setFunctionName(functionName);
		  entity.setFunctionUrl(functionUrl);
		  entity.setPid(pid);
		  entity.setFunctionDesc(functionDesc);
		  entity.setPostion(postion);
		  entity.setFid(fid);
		  
		  try{
			  if(StringUtils.isNotEmpty(fid)){
				  resourceService.updateById(entity);
				  rs.setStatus(Result.Status.OK);
				  rs.setMessage("菜单更新成功");
			  }else{
				  resourceService.insert(entity);
				  rs.setStatus(Result.Status.OK);
				  rs.setMessage("菜单创建成功");
			  }
			  
			  
		     }catch(Exception e){
			  rs.setStatus(Result.Status.ERROR);
			  rs.setMessage("菜单操作失败");
		     }
		  
		  return rs;
	}
	
	
	@RequestMapping(value = "/editResource.do")
	@ResponseBody
	public Result editResource(HttpServletRequest request,
                              HttpServletResponse response, HttpSession session)
	{
		  Result rs=new Result();
		  HttpServletRequest req=(HttpServletRequest) request;
		  
		  String functionName=req.getParameter("functionName");
		  String functionUrl=req.getParameter("functionUrl");
		  String functionDesc=req.getParameter("functionDesc");
		  String pid= req.getParameter("pid");
		  String postion= req.getParameter("postion");
		  String fid= req.getParameter("fid");
		  
		  Assert.notNull(functionName);
		  Assert.notNull(functionUrl);
		  Assert.notNull(pid);
		  Assert.notNull(fid);
		  
		  Resource entity=new Resource();
		  entity.setFunctionName(functionName);
		  entity.setFunctionUrl(functionUrl);
		  entity.setPid(pid);
		  entity.setFunctionDesc(functionDesc);
		  entity.setPostion(postion);
		  entity.setFid(fid);
		  
		  try{
			  resourceService.updateById(entity);
			  rs.setStatus(Result.Status.OK);
			  rs.setMessage("菜单更新成功");
			  
		     }catch(Exception e){
			  rs.setStatus(Result.Status.ERROR);
			  rs.setMessage("菜单更新失败");
		     }
		  
		  return rs;
	}
	
	
	
	@RequestMapping(value = "/getParentResourceNode.do")
	@ResponseBody
	public Result getParentNode(HttpServletRequest request,
                              HttpServletResponse response, HttpSession session)
	{
		  Result rs=new Result();
          //HttpServletRequest req=(HttpServletRequest) request;
		  
		  //String functionName=req.getParameter("0");
		  try{
			   List<Resource> resours=resourceService.getParentNode(Resource.SUPER_PID);
			   rs.setData(resours);
			   rs.setStatus(Result.Status.OK);
		     }catch(ServiceException e){
			   rs.setStatus(Result.Status.ERROR);
		     }
		  
		  return rs;
	}
	
	
	
	
	//@PageableDefaults 
	@RequestMapping(value="/getAllResources.do")
	public ModelAndView getAllResources(HttpServletRequest request,
                                  HttpServletResponse response, HttpSession session, Pageable pageable)
	{
		 // Result rs=new Result();
         //HttpServletRequest req=(HttpServletRequest)request;
		 //String functionName=req.getParameter("0");
		
		Resource query=new Resource();
	    
	    String pageNumber=request.getParameter("number");
	    String pageSize=request.getParameter("size");
	    //String offset=request.getParameter("offset");
	    
	    //Assert.notNull(pageNumber);
	    //Assert.notNull(pageSize);
	    // Assert.notNull(offset);
	    
	    int number= pageNumber==null?1:Integer.parseInt(pageNumber);
	    int size= pageSize==null?10:Integer.parseInt(pageSize);
	    //int off= Integer.parseInt(offset);
		//因为pageRequest页数从0开始
	    number=(number-1)<0?number:number-1;
	    Pageable pageable2 =new PageRequest(number,size);
	    
	    Page<Resource> resours= resourceService.queryPageList(query,pageable2);
	    //rs.setData(resours);
	    //rs.setStatus(Result.Status.OK);
			   
	    ModelAndView mav = new ModelAndView("admin/admin-permission", "page", resours);
		mav.addObject("query", query);
		
	    return mav;
	}




	
}
