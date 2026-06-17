package com.oblixorprime.engineersdecorreforged;

import com.oblixorprime.engineersdecorreforged.tools.RediaToolRepairRecipe;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleCraftingRecipeSerializer;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModRecipeSerializers {
   public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(
      Registries.RECIPE_SERIALIZER, EngineersDecorReforged.MOD_ID
   );
   public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<RediaToolRepairRecipe>> REDIA_TOOL_REPAIR = RECIPE_SERIALIZERS.register(
      "redia_tool_repair", () -> new SimpleCraftingRecipeSerializer<>(RediaToolRepairRecipe::new)
   );

   private ModRecipeSerializers() {
   }
}
