package LinkedList;

public class PenumpangPesawat {
    class Passenger {
        String name;
        Passenger next;

        Passenger(String name) {
            this.name = name;
            this.next = null;
        }
    }

    class Flight {
        private Passenger head;

        public void addPassenger(String name) {
            Passenger newPassenger = new Passenger(name);

            if (head == null) {
                head = newPassenger;
            } else {
                Passenger current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newPassenger;
            }
        }

        public void removePassenger(String name) {
            if (head == null) {
                System.out.println("Daftar penumpang kosong.");
                return;
            }

            if (head.name.equals(name)) {
                head = head.next;
                System.out.println("Penumpang " + name + " telah dihapus.");
                return;
            }

            Passenger current = head;
            Passenger prev = null;

            while (current != null && !current.name.equals(name)) {
                prev = current;
                current = current.next;
            }

            if (current != null) {
                prev.next = current.next;
                System.out.println("Penumpang " + name + " telah dihapus.");
            } else {
                System.out.println("Penumpang " + name + " tidak ditemukan.");
            }
        }

        public void displayPassengers() {
            if (head == null) {
                System.out.println("Daftar penumpang kosong.");
                return;
            }

            Passenger current = head;
            System.out.println("Daftar Penumpang:");
            while (current != null) {
                System.out.println("- " + current.name);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        PenumpangPesawat pp = new PenumpangPesawat();
        Flight flight = pp.new Flight();

        flight.addPassenger("Aris Fadhila");
        flight.addPassenger("Ananta Rijan");
        flight.addPassenger("Farhan");

        flight.displayPassengers();

        flight.removePassenger("Farhan");
        flight.displayPassengers();
    }
}

