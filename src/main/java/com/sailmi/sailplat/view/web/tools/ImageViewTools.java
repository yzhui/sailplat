 package com.sailmi.sailplat.view.web.tools;
 
 import com.sailmi.sailplat.foundation.domain.Accessory;
import com.sailmi.sailplat.foundation.domain.SysConfig;
import com.sailmi.sailplat.foundation.service.ISysConfigService;

import java.util.List;
 import java.util.Random;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
 
 @Component
 @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
 public class ImageViewTools
 {
 
   @Autowired
   private ISysConfigService configService;
 
   public String random_login_img()
   {
     String img = "";
     SysConfig config = this.configService.getSysConfig();
     if (config.getLogin_imgs().size() > 0) {
       Random random = new Random();
       Accessory acc = (Accessory)config.getLogin_imgs().get(
         random.nextInt(config.getLogin_imgs().size()));
       img = acc.getPath() + "/" + acc.getName();
     } else {
       img = "resources/style/common/images/login_img.jpg";
     }
     return img;
   }
 }


 
 
 