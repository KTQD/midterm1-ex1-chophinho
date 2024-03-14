public static class Book extends Item {
        public String author;
        public int numberOfPages;
        public String genre;

        public Book(String name, String description, String ID, int price, String author, int numberOfPages,
                    String genre) {
            super(name, description, ID, price);
            this.author = author;
            this.numberOfPages = numberOfPages;
            this.genre = genre;
        }

        public void showInfo() {
            System.out.println("Book name: " + name);
            System.out.println("Book description: " + getDescription());
            System.out.println("Book ID: " + ID);
            System.out.println("Book price: " + price);
            System.out.println("Book author: " + author);
            System.out.println("Bool page: " + numberOfPages);
            System.out.println("Book genre: " + genre);
        }

    }
