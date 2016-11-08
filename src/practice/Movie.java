package practice;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * For practice, add the required equals, hashCode and toString methods. Then
 * add a Comparable interface for the "natural" default sort order. Remember,
 * consider what makes these objects unique? Also consider that only one
 * field can be used for sorting. What will you do?
 * 
 */
public class Movie  implements Comparable{
    private String title;
    private String director;
    private boolean isRemake;

    public boolean isIsRemake() {
        return isRemake;
    }

    public void setIsRemake(boolean isRemake) {
        this.isRemake = isRemake;
    }
    public Movie(String title, String Director, boolean isRemake) {
        this.setTitle(title);
        this.setDirector(Director);
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", director=" + director + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.title);
        hash = 61 * hash + Objects.hashCode(this.director);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        return new CompareToBuilder()
               .append(this.title, ((Movie)o).title)
               .append(this.director, ((Movie)o).director)
               .toComparison();
        
    }
  

   
}
