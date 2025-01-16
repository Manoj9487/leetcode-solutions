int subtractProductAndSum(int n) {
    int rem, sum = 0, product = 1;
    while(n > 0) {
        rem = n % 10;
        sum += rem;
        product *= rem;
        n /= 10;
    }
    return product - sum;
}
