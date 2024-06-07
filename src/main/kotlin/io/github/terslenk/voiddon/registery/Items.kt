package io.github.terslenk.voiddon.registery

import io.github.terslenk.voiddon.Voiddon
import xyz.xenondevs.nova.addon.registry.ItemRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage

@Init(stage = InitStage.PRE_PACK)
object Items: ItemRegistry by Voiddon.registry {
    val LEAD_INGOT = registerItem("lead_ingot", localizedName = "Lead Ingot")
    val OSMIUM_INGOT = registerItem("osmium_ingot")
    val TIN_INGOT = registerItem("tin_ingot")
    val NICKEL_INGOT = registerItem("nickel_ingot")
    val SILVER_INGOT = registerItem("silver_ingot")
    val ZINC_INGOT = registerItem("zinc_ingot")
}