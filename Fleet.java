class Fleet {
    private Car[] myCars;
    public Fleet (Car[] _myCars){
        myCars = _myCars.clone();
    }
    public Car findMax(){
        /*
         A method that takes the form of Fleet.findMax(). It goes through every car in it,
         finds the one with the most miles, and returns it.
         
        */
        Car largest = myCars[0];
        for (int i = 0; i < myCars.length; i++){
            if (myCars[i].getMiles() > largest.getMiles()) largest = myCars[i];
        }
        return largest;
    }
    
}
