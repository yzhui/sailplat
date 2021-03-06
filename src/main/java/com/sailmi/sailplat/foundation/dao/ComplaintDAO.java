package com.sailmi.sailplat.foundation.dao;

import com.sailmi.database.base.GenericDAO;
import com.sailmi.sailplat.foundation.domain.Complaint;

import org.springframework.stereotype.Repository;

@Repository("complaintDAO")
public class ComplaintDAO extends GenericDAO<Complaint>
{
}

