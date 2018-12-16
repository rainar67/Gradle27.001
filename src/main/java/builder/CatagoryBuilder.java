package builder;

import model.Category;

public class CatagoryBuilder {


    private model.Category catagory;

    public CatagoryBuilder() {
        this.catagory = new Category();
    }

    public CatagoryBuilder setId(Integer id) {
        this.catagory.setId(id);
        return this;
    }

    public CatagoryBuilder setName(String name) {
        this.catagory.setName(name);
        return this;
    }

    public Category build() {
        return this.catagory;
    }


}





