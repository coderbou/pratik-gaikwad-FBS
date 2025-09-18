class Time {
    int hr;
    int min;
    int sec;

    Time(int hr, int min, int sec) {    // Constructor

        this.hr = hr;
        this.min = min;
        this.sec = sec;
     
    }

    int getHr() {    // Getter methods

        return hr;
    }

    int getMin() {
        return min;
    }

    int getSec() {
        return sec;
    }

    void setHr(int hr) {    // Setter methods

        this.hr = hr;
    }

    void setMin(int min) {
        this.min = min;
    }

     void setSec(int sec) {
        this.sec = sec;
    }

    // Method to normalize time
   // private void normalize() {
     //   if (sec >= 60) {
           // min += sec / 60;
           // sec = sec % 60;
       // }
       // if (min >= 60) {
         //   hr += min / 60;
           // min = min % 60;
        //}
        //if (hr >= 24) {
           // hr = hr % 24;
        //}
    //}

     Time add(Time t) {    // Overloaded add method: Add two Time objects

        Time result = new Time(this.hr + t.hr, this.min + t.min, this.sec + t.sec);
        return result;
    }

    Time add(int hours, String type) {    // Overloaded add method: Add hours

        Time result;
        if (type.equalsIgnoreCase("hour")) {
            result = new Time(this.hr + hours, this.min, this.sec);
        } else if (type.equalsIgnoreCase("minute")) {
            result = new Time(this.hr, this.min + hours, this.sec);
        } else if (type.equalsIgnoreCase("second")) {
            result = new Time(this.hr, this.min, this.sec + hours);
        } else {
            System.out.println("Invalid type! Use 'hour', 'minute', or 'second'.");
            result = new Time(this.hr, this.min, this.sec);
        }
        return result;
    }

    // Display method
    public void display() {
        System.out.printf("%02d:%02d:%02d\n", hr, min, sec);
    }
}

// Test Class
class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(10, 45, 50);
        Time t2 = new Time(5, 20, 30);

        System.out.print("Time 1: ");
        t1.display();
        System.out.print("Time 2: ");
        t2.display();

        // Add two Time objects
        Time t3 = t1.add(t2);
        System.out.print("t1 + t2 = ");
        t3.display();

        // Add hours
        Time t4 = t1.add(3, "hour");
        System.out.print("t1 + 3 hours = ");
        t4.display();

        // Add minutes
        Time t5 = t1.add(80, "minute");
        System.out.print("t1 + 80 minutes = ");
        t5.display();

        // Add seconds
        Time t6 = t1.add(125, "second");
        System.out.print("t1 + 125 seconds = ");
        t6.display();
    }
}
