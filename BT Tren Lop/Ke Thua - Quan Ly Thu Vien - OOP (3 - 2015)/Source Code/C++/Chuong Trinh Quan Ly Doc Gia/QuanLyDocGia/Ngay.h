#pragma once
#include <iostream>
using namespace std;

class CNgay
{
private:
	int Ngay, Thang, Nam;
public:
	friend istream& operator >>(istream &, CNgay &);
	friend ostream& operator <<(ostream &, CNgay);
	CNgay(void);
	~CNgay(void);
};

