public class MP3 extends Item {
        public String duration;

        public MP3(String name, String description, String ID, int price, String duration) {
            super(name, description, ID, price);
            this.duration = duration;
        }

        public void showInfo() {
            System.out.println("Song name: " + name);
            System.out.println("Song description: " + getDescription());
            System.out.println("Song ID: " + ID);
            System.out.println("Song price: " + price);
            System.out.println("Song duration: " + duration);

        }

    }
