package mx.edu.utez.conhlabv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.f_reloj,Fragment_Reloj())
        fragmentTransaction.commit()

        setNavDrawer()
    }







    private fun setNavDrawer(){

        btnOpenDrawer.setOnClickListener{

        nav_drawer.openDrawer(Gravity.LEFT)




        }
    }

    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        Toast.makeText(this,"Click in ${p0.title}",Toast.LENGTH_SHORT)
            .show()
        return true
    }
}
