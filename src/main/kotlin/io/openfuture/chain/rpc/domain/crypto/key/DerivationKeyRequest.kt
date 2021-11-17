package io.openfuture.chain.rpc.domain.crypto.key

import javax.validation.constraints.NotBlank

data class DerivationKeyRequest(
    @field:NotBlank var seedPhrase: String? = null,
    @field:NotBlank var derivationPath: String? = null
)