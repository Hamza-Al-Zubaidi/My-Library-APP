package com.grinta.mylibrary

import android.content.ContentValues
import android.content.Intent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class HumanDevelopment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view2 = inflater.inflate(R.layout.fragment_human_development, container, false)
        val RichDAndPDad: TextView = view2.findViewById(R.id.richdadTextViewID)
        val AttentionRevolution: TextView = view2.findViewById(R.id.attentionrevolutionTextViewID)
        val LawsofPower: TextView = view2.findViewById(R.id.lawsofpowerTextViewID)
        val PowerofThinking: TextView = view2.findViewById(R.id.thepowerofthinkingTextViewID)
        val PowerofNow: TextView = view2.findViewById(R.id.thepowerofnowTextViewID)
        val WholeNewMind: TextView = view2.findViewById(R.id.wholenewmindTextViewID)
        val TimeManagement: TextView = view2.findViewById(R.id.timemanagementTextViewID)
        val RichAndPDadImage: ImageView = view2.findViewById(R.id.rdadImage)
        val AttentionRevolutionImage: ImageView = view2.findViewById(R.id.AttentionRevolutionImage)
        val LawsofPowerImage: ImageView = view2.findViewById(R.id.LawsofPowerImage1)
        val PowerofThinkingImage: ImageView = view2.findViewById(R.id.PowerofThinkingImage1)
        val PowerofNowImage: ImageView = view2.findViewById(R.id.ThePowerofNowImage1)
        val WholeNewMindImage: ImageView = view2.findViewById(R.id.WholeNewMindImage1)
        val TimeManagementImage: ImageView = view2.findViewById(R.id.TimeManagementImage1)
        var RichDAndPDadFav: ImageView  = view2.findViewById(R.id.rdadFav)
        var AttentionRevolutionFav: ImageView  = view2.findViewById(R.id.AttentionRevolutionFav)
        var LawsofPowerFav: ImageView  = view2.findViewById(R.id.LawsofPowerFav)
        var PowerofThinkingFav: ImageView  = view2.findViewById(R.id.PowerofThinkingFav)
        var PowerofNowFav: ImageView  = view2.findViewById(R.id.ThePowerofNowFav)
        var WholeNewMindFav: ImageView  = view2.findViewById(R.id.WholeNewMindFav)
        var TimeManagementFav: ImageView  = view2.findViewById(R.id.TimeManagementFav)
        var RichDAndPDadFavFlag: Int = 0
        var AttentionRevolutionFavFlag: Int = 0
        var LawsofPowerFavFlag: Int = 0
        var PowerofThinkingFavFlag: Int = 0
        var PowerofNowFavFlag: Int = 0
        var WholeNewMindFavFLag: Int = 0
        var TimeManagementFavFlag: Int = 0



        RichDAndPDad.setOnClickListener{
            sendMessagetoPDF(8)
        }
        RichAndPDadImage.setOnClickListener {
            sendMessagetoPDF(8)
        }
        RichDAndPDadFav.setOnClickListener {
            if(RichDAndPDadFavFlag == 0){
                checkFavourite(RichDAndPDad, RichDAndPDadFav, RichDAndPDadFavFlag)
                RichDAndPDadFavFlag = 1
            }
            else{
                checkFavourite(RichDAndPDad, RichDAndPDadFav, RichDAndPDadFavFlag)
                RichDAndPDadFavFlag = 0
            }
        }

        AttentionRevolution.setOnClickListener{
            sendMessagetoPDF(9)
        }
        AttentionRevolutionImage.setOnClickListener {
            sendMessagetoPDF(9)
        }
        AttentionRevolutionFav.setOnClickListener {
            if(AttentionRevolutionFavFlag == 0){
                checkFavourite(AttentionRevolution, AttentionRevolutionFav, AttentionRevolutionFavFlag)
                AttentionRevolutionFavFlag = 1
            }
            else{
                checkFavourite(AttentionRevolution, AttentionRevolutionFav, AttentionRevolutionFavFlag)
                AttentionRevolutionFavFlag = 0
            }
        }

        LawsofPower.setOnClickListener{
            sendMessagetoPDF(10)
        }
        LawsofPowerImage.setOnClickListener {
            sendMessagetoPDF(10)
        }
        LawsofPowerFav.setOnClickListener {
            if(LawsofPowerFavFlag == 0){
                checkFavourite(LawsofPower, LawsofPowerFav, LawsofPowerFavFlag)
                LawsofPowerFavFlag = 1
            }
            else{
                checkFavourite(LawsofPower, LawsofPowerFav, LawsofPowerFavFlag)
                LawsofPowerFavFlag = 0
            }
        }

        PowerofThinking.setOnClickListener{
            sendMessagetoPDF(11)
        }
        PowerofThinkingImage.setOnClickListener {
            sendMessagetoPDF(11)
        }
        PowerofThinkingFav.setOnClickListener {
            if(PowerofThinkingFavFlag == 0){
                checkFavourite(PowerofThinking, PowerofThinkingFav, PowerofThinkingFavFlag)
                PowerofThinkingFavFlag = 1
            }
            else{
                checkFavourite(PowerofThinking, PowerofThinkingFav, PowerofThinkingFavFlag)
                PowerofThinkingFavFlag = 0
            }
        }

        PowerofNow.setOnClickListener{
            sendMessagetoPDF(12)
        }
        PowerofNowImage.setOnClickListener {
           sendMessagetoPDF(12)
        }
        PowerofNowFav.setOnClickListener {
            if(PowerofNowFavFlag == 0){
                checkFavourite(PowerofNow, PowerofNowFav, PowerofNowFavFlag)
                PowerofNowFavFlag = 1
            }
            else{
                checkFavourite(PowerofNow, PowerofNowFav, PowerofNowFavFlag)
                PowerofNowFavFlag = 0
            }
        }

        WholeNewMind.setOnClickListener{
            sendMessagetoPDF(13)
        }
        WholeNewMindImage.setOnClickListener {
            sendMessagetoPDF(13)
        }
        WholeNewMindFav.setOnClickListener {
            if(WholeNewMindFavFLag == 0){
                checkFavourite(WholeNewMind, WholeNewMindFav, WholeNewMindFavFLag)
                WholeNewMindFavFLag = 1
            }
            else{
                checkFavourite(WholeNewMind, WholeNewMindFav, WholeNewMindFavFLag)
                WholeNewMindFavFLag = 0
            }
        }

        TimeManagement.setOnClickListener{
            sendMessagetoPDF(14)
        }
        TimeManagementImage.setOnClickListener {
            sendMessagetoPDF(14)
        }
        TimeManagementFav.setOnClickListener {
            if(TimeManagementFavFlag == 0){
                checkFavourite(TimeManagement, TimeManagementFav, TimeManagementFavFlag)
                TimeManagementFavFlag = 1
            }
            else{
                checkFavourite(TimeManagement, TimeManagementFav, TimeManagementFavFlag)
                TimeManagementFavFlag = 0
            }
        }
        return view2
    }

    fun checkFavourite(BookName: TextView, FavouriteImage: ImageView, favFlag: Int){
        if (favFlag == 0) {
            FavouriteImage.setImageDrawable(ContextCompat.getDrawable(requireView().context, R.drawable.heart))
            Toast.makeText(requireView().context, "Added to favourite list", Toast.LENGTH_LONG).show()

            val values = ContentValues()
            values.put(LibraryProvider.NAME, BookName.text.toString())
            context?.contentResolver?.insert(LibraryProvider.CONTENT_URI, values)
        } else {
            FavouriteImage.setImageDrawable(ContextCompat.getDrawable(requireView().context, R.drawable.emptyheart))
            Toast.makeText(requireView().context, "Removed from favourite list", Toast.LENGTH_LONG).show()

            val selection = "name = \"" + BookName.text.toString() + "\""

            val rowsDeleted = context?.contentResolver?.delete(
                LibraryProvider.CONTENT_URI,
                selection, null
            )
        }
    }

    fun sendMessagetoPDF(code: Int){
        val PDFIntent = Intent(context, PDFViewer::class.java)
        PDFIntent.putExtra("Flag", code)
        startActivity(PDFIntent)
    }
}