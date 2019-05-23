package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.dao.CategoryMapper;
import com.example.demo.dao.UsersMapper;
import com.example.demo.entity.category;
import com.example.demo.entity.users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisplusApplicationTests {

	@Autowired
	private CategoryMapper categoryMapper;
	@Autowired
	private UsersMapper usersMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void selectCategory(){
		List<category> list = categoryMapper.selectList(null);
		list.forEach(System.out::println);
 	}

	@Test
	public void selectUsers(){
		List<users> list = usersMapper.selectList(null);
		list.forEach(System.out::println);
	}

	@Test
	public void insertUsers(){
		users user = new users();
		user.setId(231);
		user.setUsername("向前");
		user.setPassword("12345");
		user.setEmail("xq@qq.com");
		usersMapper.insert(user);
		List<users> list = usersMapper.selectList(null);
		list.forEach(System.out::println);
	}

	@Test
	public void updateUsersById(){
		users user = new users();
		user.setId(6);
		user.setUsername("向后");
		user.setPassword("12345");
		user.setEmail("xh@qq.com");
		usersMapper.updateById(user);
		List<users> list = usersMapper.selectList(null);
		list.forEach(System.out::println);
	}

	@Test
	public void selectMapUsers(){
		Map<String,Object> map = new HashMap<>();
		map.put("username","马弟");
		List<users> list = usersMapper.selectByMap(map);
		list.forEach(System.out::println);
	}

	@Test
	public void selectByWrapper(){
		QueryWrapper<users> queryWrapper = new QueryWrapper<users>();
		queryWrapper.like("username","毛");
		List<users> list = usersMapper.selectList(queryWrapper);
		list.forEach(System.out::println);
	}

	@Test
	public void selectByWrapperOne(){
		QueryWrapper<users> queryWrapper = new QueryWrapper<users>();
		queryWrapper.like("username","毛").and(wq->wq.lt("id",13).isNotNull("email"));
		List<users> list = usersMapper.selectList(queryWrapper);
		list.forEach(System.out::println);
	}

	@Test
	public void selectPage(){
		QueryWrapper<category> queryWrapper = new QueryWrapper<category>();
		Page<category> page = new Page<category>(1,3);
		IPage<category> iPage = categoryMapper.selectPage(page,queryWrapper);
		System.out.println("总页数："+iPage.getPages());
		System.out.println("总条数："+iPage.getTotal());
		List<category> list = iPage.getRecords();
		list.forEach(System.out::println);
	}


	@Test
	public void selectPage2(){
		QueryWrapper<users> queryWrapper = new QueryWrapper<users>();
		Page<users> page = new Page<users>(1,3);
		IPage<users> iPage = usersMapper.selectPage2(page,queryWrapper);
		System.out.println("总页数："+iPage.getPages());
		System.out.println("总条数："+iPage.getTotal());
		List<users> list = iPage.getRecords();
		list.forEach(System.out::println);
	}


	@Test
	public void selectById(){
		users user = new users();
		user.setId(6);
		users list = user.selectById();
		System.out.println(list);
	}
	
}
