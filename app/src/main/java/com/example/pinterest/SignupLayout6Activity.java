package com.example.pinterest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

public class SignupLayout6Activity extends AppCompatActivity {
    GridView gridView;
    GridviewAdapter gridviewAdapter;
    ArrayList<HinhAnh> arrayList;
    Button btn_Next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_layout6);
        gridView = (GridView) findViewById(R.id.gridView);
        arrayList = new ArrayList<>();
        DataArray();
        gridviewAdapter = new GridviewAdapter(arrayList,getApplicationContext());
        gridView.setAdapter(gridviewAdapter);
        btn_Next = (Button) findViewById(R.id.btn_next6);
        btn_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupLayout6Activity.this, LayoutTrangchuActivity.class);
                startActivity(intent);
            }
        });
    }
    public void DataArray(){
        arrayList.add(new HinhAnh("https://flowershop.com.vn/wp-content/uploads/2020/09/y-nghia-hoa-cuc-hoa-mi-6-min.jpg","Hoa"));
        arrayList.add(new HinhAnh("https://phongduy.vn/wp-content/uploads/2020/11/xu-h%C6%B0%E1%BB%9Bng-tranh-ngh%E1%BB%87-thu%E1%BA%ADt.jpg","Nghệ thuật"));
        arrayList.add(new HinhAnh("https://img.susureview.com/Blogs/son-mong-tay-la-gi.png","Móng tay"));
        arrayList.add(new HinhAnh("https://lh3.googleusercontent.com/pw/ACtC-3dqgol2rZsEK3T4umYrIygmsSHdKAzb9osuDGpphjuwXVieFJ6XNso07zlGuRZYBb7qjUv36Qs0VUiEm2Y_HILTgq5sxSl3hGViCFaPxn747sd0aekC5OsxP6ES8ASLpo7MIfRhcBK_u6Z5t5FKEpIPYg=w384-h576-no?authuser=0","Giáo dục"));
        arrayList.add(new HinhAnh("https://m.media-amazon.com/images/I/81Hry39II8L._AC_SL1500_.jpg","Anime"));
        arrayList.add(new HinhAnh("https://www.digital38.com.vn/wp-content/uploads/2021/01/nhiep-anh-gia-chanh-nguyen.-1.jpg","Nhiếp ảnh"));
        arrayList.add(new HinhAnh("https://cdn.laohac.vn/2020/10/1-min.png","Động vật"));
        arrayList.add(new HinhAnh("https://hunghy.com.vn/assets/upload/hunghy/res/tin-tuc/di-bo-tot-cho-nguoi-suy-gian-tinh-mach-min.jpg","Sức khỏe"));
        arrayList.add(new HinhAnh("https://xaydungso.vn/img/images/posts/ly-do-nen-chon-cau-thang-co-gac-lung0.png","Thiết kế"));
        arrayList.add(new HinhAnh("https://nld.mediacdn.vn/2018/9/10/maninthemoonbypearpear-d56txq0-1536578978353147963425.jpg","Mặt trăng"));
        arrayList.add(new HinhAnh("https://locphuc.com.vn/Content/Images/Product/DFH0077R-54616-02418/nhan-nu-trang-suc-kim-cuong-vang-trang-18K-DFH0077R-g1.jpg","Trang sức"));
        arrayList.add(new HinhAnh("https://vnn-imgs-a1.vgcloud.vn/znews-photo.zadn.vn/w660/Uploaded/bgtngt/2019_10_07/293590fabatmobileforsalerussia1.jpg","Xe"));
        arrayList.add(new HinhAnh("https://free.vector6.com/wp-content/uploads/2020/09/Free-vector-000460-thuc-te-bau-troi-xanh-nen.jpg","Bầu trời xanh"));
        arrayList.add(new HinhAnh("https://thuysinh4u.com/wp-content/uploads/2020/03/C%C3%A1-ch%C3%A9p-Koi-b%C6%B0%E1%BB%9Bm-%C4%91%E1%BA%B9p.jpg","Koi"));
        arrayList.add(new HinhAnh("https://tattooga.vn/wp-content/uploads/2018/04/all-seeing-eye-tattoo-5-650x721.png","Hình xăm"));
    }
}