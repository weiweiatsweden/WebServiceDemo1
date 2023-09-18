package com.wei.webservicedemo.service;

import com.wei.webservicedemo.Entities.Blogs;
import com.wei.webservicedemo.Entities.Users;
import com.wei.webservicedemo.repository.BlogRepository;
import com.wei.webservicedemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogService implements BlogServiceInterface {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blogs> getAllBlogs() {
        return(List<Blogs>) blogRepository.findAll();
    }

    @Override
    public Blogs addBlog(Blogs blog) {
        return blogRepository.save(blog);
    }

    @Override
    public Blogs getBlogById(int id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public Blogs deleteBlogById(int id) {
        blogRepository.deleteById(id);
        return null;
    }

    @Override
    public Blogs updateBlogById(Blogs blogs, int blogID) {
        //Blogs blogToUpdate = getBlogById(blogID);
        //blogToUpdate.setBlogText(blogs.getBlogText());
        blogRepository.save(blogs);

        return blogs;

        /*
        	public Car updateCar(Car car, int carId) {
		Car carToUpdate = getCarById(carId);
		if (carToUpdate.isBooked()) {
			throw new RuntimeException("Cannot update a booked car");
		} else {
			carToUpdate.setPricePerDay(car.getPricePerDay());
			carToUpdate.setModel(car.getModel());
			carToUpdate.setManufacture(car.getManufacture());
			carToUpdate.setRegistrationNumber(car.getRegistrationNumber());
			carRepository.save(carToUpdate);
			Log4j.logger.info("Admin updated car:" + carToUpdate);
			return carToUpdate;
		}
         */
    }
}
