int sum3(int fr, int se, int tr) {
    return fr + se + tr;
}

void chek(int fn, int rig){
    if (fn == rig){
        System.out.println("совпадает");
    }
    else {
        System.out.println("неверно");
    }
    return;
}
void datachek(){
    chek(sum3(10, 20, 37), 67);
    chek(sum3(0, 0, 0), 0);
    chek(sum3(-5, -3, 5), -3);
    chek(sum3(333333, 333333, 333333), 999999);
}


void main(String[] args) {
    System.out.println("inf");
    System.out.println(sum3(10, 20, 37));
    datachek();
    return;
}