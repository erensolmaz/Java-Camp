package business;

import java.util.List;

import core.logger;
import dataAccess.DataDao;
import entities.Category;

public class CategoryManager {
    private List<Category> categories;
	private DataDao dataDao;
    private logger[] loggers;
    /**
     * @param categories
     * @param dataDao
     * @param loggers
     */
    public CategoryManager(List<Category> categories, DataDao dataDao, logger[] loggers) {
        this.categories = categories;
        this.dataDao = dataDao;
        this.loggers = loggers;
    }
    public void add(Category category) throws Exception{
        for(Category categories : categories){
        if(categories.getCategoryName().equals(category.getCategoryName())){
        throw new Exception("Kategori isimleri aynı olamaz");

    }
    }
	    dataDao.add(category);
		categories.add(category);
           

    for (logger logger : loggers) {
        logger.log(category.getCategoryName());
        
    }
    }

    
}
