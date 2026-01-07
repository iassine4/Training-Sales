/**
 * 
 */
package fr.fms.trainingstore.domain;

/**
 * @author ZribaY
 *
 */
public class Training {
	
	private int id;
    private String name;
    private String description;
    private int durationDays;
    private Modality modality;
    private double price;

    private Category category; // optionnelle

    public Training() {
    }

    public Training(int id, String name, String description, int durationDays, Modality modality, double price, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.durationDays = durationDays;
        this.modality = modality;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    public Modality getModality() {
        return modality;
    }

    public void setModality(Modality modality) {
        this.modality = modality;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        String categoryLabel = (category == null) ? "none" : category.getLabel();
        return String.format("%d | %s | %dj | %s | %.2f € | %s",
                id, name, durationDays, modality, price, categoryLabel);
    }

}
