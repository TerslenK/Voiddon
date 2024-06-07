package io.github.terslenk.voiddon

import xyz.xenondevs.nova.addon.Addon

object Voiddon : Addon() {
    
    override fun init() {
        // Called when the addon is initialized.
        System.out.println("Hayırlı Olsun paşam")
    }
}