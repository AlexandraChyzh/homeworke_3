package app.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class WomenDress implements Serializable {

    private  Long id;
    private String title;
    private String brand;
    private BigDecimal price;
    private String article;

    public WomenDress(Long id, String title, String brand, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof WomenDress that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(brand, that.brand) && Objects.equals(price, that.price) && Objects.equals(article, that.article);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, brand, price, article);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "WomenDress{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", article='" + article + '\'' +
                '}';
    }
}
