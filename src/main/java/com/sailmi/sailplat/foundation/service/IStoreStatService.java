package com.sailmi.sailplat.foundation.service;

import com.sailmi.database.query.support.IPageList;
import com.sailmi.database.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.StoreStat;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IStoreStatService
{
  public abstract boolean save(StoreStat paramStoreStat);

  public abstract StoreStat getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(StoreStat paramStoreStat);

  public abstract List<StoreStat> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}



 
 