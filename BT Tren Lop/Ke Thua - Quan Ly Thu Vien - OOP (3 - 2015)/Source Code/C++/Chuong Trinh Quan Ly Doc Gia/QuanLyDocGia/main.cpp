#include "ThuVien.h"

int main()
{
	ThuVien x;
	cin >> x;
	cout << x;
	cout << "\nTong tien nhan duoc cua thu vien: " << (size_t)x.TinhTongTienLamThe();

	system("pause");
	return 0;
}