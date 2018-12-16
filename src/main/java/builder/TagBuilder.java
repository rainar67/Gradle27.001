package builder;

import javafx.scene.control.Tab;
import model.Tag;

public class TagBuilder {
    private  model.Tag tag;
   public TagBuilder() {
        this.tag = new Tag();
    }
    public TagBuilder setId(Integer id){
        this.tag.setId(id);
        return this;
    }
    public  TagBuilder setName(String name){
        this.tag.setName(name);
        return this;
    }
    public Tag build(){
        return  this.tag;
    }








    }

