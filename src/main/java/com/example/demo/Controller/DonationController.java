package com.example.demo.Controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.DonationEntity;
import com.example.demo.Service.DonationService;

@RestController
@CrossOrigin
public class DonationController 
{
	@Autowired
	DonationService doser;
	
	@PostMapping("/post")
	public String added(@RequestBody DonationEntity de)
	{
		doser.add(de);
		return "Added Member " + de.getDonid();
	}
	
	@GetMapping("/get")
	public List<DonationEntity> getinfo()
	{
		return doser.read();
	}
	
	@PutMapping("/put")
	public String updated(@RequestBody DonationEntity de1)
	{
		doser.update(de1);
		return "Updated Successfully";
	}
	
	@DeleteMapping("/delete/{donid}")
	public String deleted(@PathVariable ("donid") int donid)
	{
		doser.delete(donid);
		return "Deleted";
	}
	
	@GetMapping("/sort/{field}")
	public List<DonationEntity> getSort(@PathVariable String field)
	{
		return doser.sort(field);
	}
	
	@GetMapping("Pagin/{Offset}/{PageSize}")
	public List<DonationEntity> pagination(@PathVariable int Offset, @PathVariable int PageSize)
	{
		return doser.pagin(Offset, PageSize);
	}
	
}
