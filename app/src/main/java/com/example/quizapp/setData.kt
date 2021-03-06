package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "რომელია ყველაზე კარგი ზოდიაქოს ნიშანი?",

           "მშვილდოსანი",
           "სასწორი",
           "თევზები",
           "მორიელი",
           4
       )
       var question2 = QuestionData(
           2,
           "რომელი პლანეტა მართავს მორიელს?",

           "მარსი",
           "ვენერა",
           "იუპიტერი",
           "ნეპტუნი",
           1
       )
       var question3 = QuestionData(
           3,
           "რომელი ზოდიაქოები ეწყობიან ყველაზე მეტად?",

           "ლომი და თევზები",
           "მორიელი და მერწყული",
           "კურო და მშვილდოსანი",
           "სასწორი და ტყუპები",
           2
       )
       var question4 = QuestionData(
           4,
           "რომელია ყველაზე ტოქსიკური ზოდიაქოს ნიშანი?",

           "კურო",
           "ქალწული",
           "ტყუპები",
           "მორიელი",
           3
       )

       var question5 = QuestionData(
           5,
           "რისი წელია 2022?",

           "კატის",
           "ძაღლის",
           "თევზის",
           "ვეფხვის",
           4
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       return que
   }
}