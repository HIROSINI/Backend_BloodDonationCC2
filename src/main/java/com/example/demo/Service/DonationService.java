package com.example.demo.Service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Entity.DonationEntity;
import com.example.demo.Repository.DonationRepo;

@Service
public class DonationService 
{
	@Autowired
	DonationRepo dorepo;
	
	public String add(DonationEntity d)
	{
		dorepo.save(d);
		return "Added!";
	}
	
	public List<DonationEntity> read()
	{
		return dorepo.findAll();
	}
	
	public String update(DonationEntity d)
	{
		dorepo.saveAndFlush(d);
		return "Updated!";
	}
	
	public String delete(int did)
	{
		dorepo.deleteById(did);
		return "Deleted";
	}
	
	public List<DonationEntity> sort(String field)
	{
		return dorepo.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	
	public List<DonationEntity> pagin(@PathVariable int Offset,@PathVariable int PageSize)
	{
		Page<DonationEntity> page=dorepo.findAll(PageRequest.of(Offset, PageSize));
		return page.getContent();
	}

	
}
