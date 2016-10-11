#include <iostream>

using namespace std;

int main(){
    int a[3];
    int b[3];
    cin >> a[0] >> a[1] >> a[2];
    cin >> b[0] >> b[1] >> b[2];
    int a_score = 0;
    int b_score = 0;
    for(int i = 0; i <=2; ++i) {
        if (a[i] > b[i])
            ++a_score;
        else if (a[i] < b[i])
            ++b_score;
    }
    cout << a_score << " " << b_score;
    return 0;
}
