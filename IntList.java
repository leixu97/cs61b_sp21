public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }


//    size
    public int Size(IntList r) {
//        should use recursion
//        int size = 0;

        if (r.rest == null) {return 1;}

        return Size(r.rest) + 1;
    }

    //    use iteration
    public int iterativeSize(IntList r){
    IntList current = r;
    int size = 0;
    while (
            current != null
        ) {

        current = current.rest;
        size+=1;
    }
    return size;
    }

    public int get(int i){
        IntList p = this;
        for (int counter = 0; counter < i; counter+=1)
        {p = p.rest;}
        return p.first;
    }

}
