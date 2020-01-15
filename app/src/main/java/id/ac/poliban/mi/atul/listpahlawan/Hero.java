package id.ac.poliban.mi.atul.listpahlawan;

public class Hero {
    private String image;
    private String heroName;
    private String heroDetail;

    public Hero(String image, String heroName, String heroDetail) {
        this.image = image;
        this.heroName = heroName;
        this.heroDetail = heroDetail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroDetail() {
        return heroDetail;
    }

    public void setHeroDetail(String heroDetail) {
        this.heroDetail = heroDetail;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s", getHeroName(), getHeroDetail());
    }
}
