/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author sihai
 */
@Entity
public class Todo implements Serializable {
    @Id
    @GeneratedValue
    int id;
    
    String title;
    
    boolean isFinish;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isIsFinish() {
        return isFinish;
    }

    public void setIsFinish(boolean isFinish) {
        this.isFinish = isFinish;
    }

    @Override
    public String toString() {
        return "Todo{" + "id=" + id + ", title=" + title + ", isFinish=" + isFinish + '}';
    }
    
}
