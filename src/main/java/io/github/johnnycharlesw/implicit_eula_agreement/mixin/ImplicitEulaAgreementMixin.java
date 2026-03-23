package io.github.johnnycharlesw.implicit_eula_agreement.mixin;


import net.minecraft.server.dedicated.EulaReader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EulaReader.class)
class ImplicitEulaAgreementMixin {
    @Inject(method="isEulaAgreedTo", at=@At("HEAD"))
    public boolean onAgreementCheck(CallbackInfo ci) {
        System.out.println("User already agreed for the entire server network");
        return true; // IF the user installed this, they probably already agreed to it and just want 
    }
}