/**
 * 
 */
package fr.fms.trainingstore.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZribaY
 *
 */
public class Cart {
	
	private int id;
    private int userId;
    private List<CartLine> lines = new ArrayList<>();

    public Cart() {
    }

    public Cart(int id, int userId) {
        this.id = id;
        this.userId = userId;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<CartLine> getLines() {
        return lines;
    }

    public void setLines(List<CartLine> lines) {
        this.lines = lines;
    }

    public boolean isEmpty() {
        return lines == null || lines.isEmpty();
    }
    
    
    public String toString() {
        return "Cart{id=" + id + ", userId=" + userId + ", lines=" + lines.size() + "}";
    }

}
