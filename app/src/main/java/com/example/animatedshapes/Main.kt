package com.example.animatedshapes

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val circle: View = findViewById(R.id.circle)
        val smallCircle: View = findViewById(R.id.smallCircle)
        val smallSquare: View = findViewById(R.id.smallSquare)
        val smallTriangle: View = findViewById(R.id.smallTriangle)

        val scaleUpCircleX = ObjectAnimator.ofFloat(circle, "scaleX", 1f, 3f)
        val scaleUpCircleY = ObjectAnimator.ofFloat(circle, "scaleY", 1f, 3f)
        val scaleDownCircleX = ObjectAnimator.ofFloat(circle, "scaleX", 3f, 1f)
        val scaleDownCircleY = ObjectAnimator.ofFloat(circle, "scaleY", 3f, 1f)

        val scaleUpSmallCircleX = ObjectAnimator.ofFloat(smallCircle, "scaleX", 1f, 2f)
        val scaleUpSmallCircleY = ObjectAnimator.ofFloat(smallCircle, "scaleY", 1f, 2f)
        val scaleDownSmallCircleX = ObjectAnimator.ofFloat(smallCircle, "scaleX", 2f, 1f)
        val scaleDownSmallCircleY = ObjectAnimator.ofFloat(smallCircle, "scaleY", 2f, 1f)

        val scaleUpSquareX = ObjectAnimator.ofFloat(smallSquare, "scaleX", 1f, 2f)
        val scaleUpSquareY = ObjectAnimator.ofFloat(smallSquare, "scaleY", 1f, 2f)
        val scaleDownSquareX = ObjectAnimator.ofFloat(smallSquare, "scaleX", 2f, 1f)
        val scaleDownSquareY = ObjectAnimator.ofFloat(smallSquare, "scaleY", 2f, 1f)

        val scaleUpTriangleX = ObjectAnimator.ofFloat(smallTriangle, "scaleX", 1f, 2f)
        val scaleUpTriangleY = ObjectAnimator.ofFloat(smallTriangle, "scaleY", 1f, 2f)
        val scaleDownTriangleX = ObjectAnimator.ofFloat(smallTriangle, "scaleX", 2f, 1f)
        val scaleDownTriangleY = ObjectAnimator.ofFloat(smallTriangle, "scaleY", 2f, 1f)

        scaleUpCircleX.duration = 500
        scaleUpCircleY.duration = 500
        scaleDownCircleX.duration = 300
        scaleDownCircleY.duration = 300

        scaleUpSmallCircleX.duration = 500
        scaleUpSmallCircleY.duration = 500
        scaleDownSmallCircleX.duration = 300
        scaleDownSmallCircleY.duration = 300

        scaleUpSquareX.duration = 500
        scaleUpSquareY.duration = 500
        scaleDownSquareX.duration = 300
        scaleDownSquareY.duration = 300

        scaleUpTriangleX.duration = 500
        scaleUpTriangleY.duration = 500
        scaleDownTriangleX.duration = 300
        scaleDownTriangleY.duration = 300

        val animatorSet = AnimatorSet()
        animatorSet.playSequentially(
            scaleUpCircleX, scaleUpCircleY, scaleUpSmallCircleX, scaleUpSmallCircleY,
            scaleUpSquareX, scaleUpSquareY, scaleUpTriangleX, scaleUpTriangleY,
            scaleDownCircleX, scaleDownCircleY, scaleDownSmallCircleX, scaleDownSmallCircleY,
            scaleDownSquareX, scaleDownSquareY, scaleDownTriangleX, scaleDownTriangleY
        )

        animatorSet.addListener(object : android.animation.Animator.AnimatorListener {
            override fun onAnimationStart(animation: android.animation.Animator) {}

            override fun onAnimationEnd(animation: android.animation.Animator) {
                animatorSet.start()
            }

            override fun onAnimationCancel(animation: android.animation.Animator) {}
            override fun onAnimationRepeat(animation: android.animation.Animator) {}
        })

        animatorSet.start()
    }
}
