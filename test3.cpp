#include<iostream>
#include<cmath>
#include<cstdlib>
#include<string>
using namespace std;
typedef struct {
	string ho_ten;
	int nam_sinh;
	string que_quan;
	long mssv;
}Sinhvien;// Dinh nghia kieu du lieu cau truc sinh  vien
int khoa(long a) //ham xu ly khoa sinh vien
{
	switch(a/10000)
	{
			case 2019:
				{
						return 64;
						break;
				}
			case 2018:
				{
						return 63;
						break;
				}
			case 2017:
				{
						return 62;
						break;
				}
			case 2016:
				{
						return 61;
						break;
				}
			case 2015:
				{
						return 60;
						break;
				}
			
}
}

int main()
{
	Sinhvien* sv;
	int i,n=0,m;
	cout<<"Nhap so luong sinh vien";
	cin>>m;
	sv=new Sinhvien[m];
	char s;
	for (i = 0; i < m; i++)
	{
		cout << "Nhap ten sinh vien " << i + 1 << ":";
		fflush(stdin);
			getline(cin,sv->ho_ten);
		cout<<"Nhap nam sinh:";
		fflush(stdin);
			cin>>(sv->nam_sinh);
		cout<<"Nhap que quan :";
		fflush(stdin);
			getline(cin,sv->que_quan);
		cout<<"Nhap ma so sinh vien:";
			cin >> sv[i].mssv;
		n++;
		cout << "Ban co muon nhap tiep hay khong ?(Y/N):";
		cin>>s;
		if (s=='Y')
		{
			continue;
		}
		else{ 
			break;}
	}
	cout << " ============        Danh sach sinh vien       ==============   " << endl;
	cout << "   Ho va ten        Nam sinh       Que quan       Khoa     MSSV" << endl;
	for (i = 0; i < n;i++)
	{	
		cout << (i + 1)<<"."<< sv[i].ho_ten << "       " << sv[i].nam_sinh << "          " << sv[i].que_quan << "             " <<khoa(sv[i].mssv)<<"         "<< sv[i].mssv;
	cout<<endl;
	}
	delete [] sv;
	system("pause");
	return 0;
}
// Dinh nghia Ham



