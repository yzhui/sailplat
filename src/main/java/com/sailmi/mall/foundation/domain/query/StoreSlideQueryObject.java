 package com.sailmi.mall.foundation.domain.query;
 
 import org.springframework.web.servlet.ModelAndView;

import com.sailmi.mall.core.query.QueryObject;
 
 public class StoreSlideQueryObject extends QueryObject
 {
   public StoreSlideQueryObject(String currentPage, ModelAndView mv, String orderBy, String orderType)
   {
     super(currentPage, mv, orderBy, orderType);
   }
 
   public StoreSlideQueryObject()
   {
   }
 }



 
 