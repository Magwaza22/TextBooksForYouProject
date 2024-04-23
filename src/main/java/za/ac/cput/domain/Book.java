package za.ac.cput.domain;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private String isbn;

    private Book(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.publicationYear = builder.publicationYear;
        this.isbn = builder.isbn;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getIsbn() {
        return isbn;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    public static class Builder {
        private String title;
        private String author;
        private int publicationYear;
        private String isbn;

        public Builder() {}

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder withAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder withPublicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
            return this;
        }

        public Builder withIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
