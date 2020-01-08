package com.shop.service.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shop.entity.Shop;
import com.shop.mapper.ShopMapper;
import com.shop.service.ShopService;
import com.shop.utils.PageUtil;

import freemarker.template.Configuration;
import freemarker.template.Template;
@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	private ShopMapper shopMapper;
	
	@Autowired
	private FreeMarkerConfig freeMarkerConfig;
	
	@Value("${pagedir}")
	private String pagedir;
	
	@Override
	public PageUtil findAll(Integer page, Integer size) {
		PageHelper.startPage(page, size);
		PageInfo<Shop> info = new PageInfo<Shop>(shopMapper.findAll());
		return new PageUtil(info.getList(), info.getTotal());
	}

	@Override
	public void updateStatus(Integer id, Integer status) {
		shopMapper.updateStatus(id,status);
		if(status == 1){
			Configuration configuration = freeMarkerConfig.getConfiguration();
			try {
				Template template = configuration.getTemplate("list.ftl");
				Map dataModel = new HashMap();
				Shop shop = shopMapper.findOne(id);
				dataModel.put("shop", shop);
				Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pagedir+id+".html"),"UTF-8"));
				template.process(dataModel, writer);
				writer.close();
				System.out.println("页面生成");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(status == 0){
			new File(pagedir+id+".html").delete();
			System.out.println("页面删除");
		}
	}
}
