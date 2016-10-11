#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main(){
    int n;
    int sum = 0;
    cin >> n;
    vector<int> arr(n);
    for(int arr_i = 0;arr_i < n;arr_i++){
        int temp;
        cin >> temp;
        sum += temp;
    }
    /*
    for(int i = 0; i < n; ++i) {
        sum += arr[i];
    }
    */
    cout << sum;
    return 0;
}
