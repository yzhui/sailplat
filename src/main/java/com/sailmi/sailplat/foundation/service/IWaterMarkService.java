package com.sailmi.sailplat.foundation.service;

import com.sailmi.database.query.support.IPageList;
import com.sailmi.database.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.WaterMark;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IWaterMarkService
{
  public abstract boolean save(WaterMark paramWaterMark);

  public abstract WaterMark getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(WaterMark paramWaterMark);

  public abstract List<WaterMark> query(String paramString, Map paramMap, int paramInt1, int paramInt2);

  public abstract WaterMark getObjByProperty(String paramString, Object paramObject);
}



 
 