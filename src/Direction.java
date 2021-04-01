
    public enum Direction
    {

        EAST(1,0),
        NORTH(0,-1),
        WEST(-1,0),
        SOUTH(0,1);

        public static final Direction RIGHT =EAST;
        public static final Direction LEFT =WEST;
        public static final Direction FORWARD =NORTH;
        public static final Direction BACKWARD =SOUTH;

        private int dx;
        private int dy;

        private Direction(int dx, int dy){
            this.dx=dx;
            this.dy=dy;
        }
        public int getDx()
        {
            return dx;
        }
        public int getDy(){
            return dy;
        }

        }
