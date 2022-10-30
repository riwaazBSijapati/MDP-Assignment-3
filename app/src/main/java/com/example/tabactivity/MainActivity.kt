package com.example.tabactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.graphics.Color
import android.view.View
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addBtn = findViewById(R.id.addButton) as Button
        var versionText = findViewById(R.id.versionInput) as TextView
        var codeNameText = findViewById(R.id.codeNameInput) as TextView
        var tableOut = findViewById(R.id.outTable) as TableLayout
        addBtn.setOnClickListener{
            var codeLay = TextView(applicationContext)
            codeLay.textAlignment= View.TEXT_ALIGNMENT_CENTER
            codeLay.setBackgroundResource(R.color.purple_200)
            codeLay.setTextColor(Color.parseColor("#000000"))
            codeLay.text = codeNameText.text.toString();

            var verLay = TextView(applicationContext)
            verLay.textAlignment= View.TEXT_ALIGNMENT_CENTER
            verLay.setBackgroundResource(R.color.purple_200)
            verLay.setTextColor(Color.parseColor("#000000"))
            verLay.text = versionText.text.toString();

            var tableRow = TableRow(applicationContext)

            val layoutParamsLeft = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
            layoutParamsLeft.setMargins(0,0,5,0)
            val layoutParamsRight = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
            layoutParamsRight.setMargins(0,0,0,0)

            tableRow.setLayoutParams(layoutParamsRight)

            tableRow.addView(codeLay,0,layoutParamsLeft)
            tableRow.addView(verLay,1,layoutParamsRight)
            tableOut.addView(tableRow)
        }
//          Attempt to use binding however it didn't work
//        binding.addButton.setOnClickListener{
//            var tableRow = TableRow(applicationContext)
//            val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
//            tableRow.layoutParams=layoutParams
//
//            var codeLay = TextView(applicationContext)
//            codeLay.text = binding.codeNameInput.text.toString();
//            var verLay = TextView(applicationContext)
//            verLay.text = binding.versionInput.text.toString();
//
//            tableRow.addView(verLay)
//            tableRow.addView(codeLay)
//
//            binding.outTable.addView(tableRow)
//        }
    }
}