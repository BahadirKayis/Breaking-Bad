package com.muratozturk.breakingbad.domain.use_case.episode_list

import com.muratozturk.breakingbad.domain.repository.BreakingBadRepository
import javax.inject.Inject

class GetEpisodesUseCase @Inject constructor(
    private val repository: BreakingBadRepository
) {
    suspend operator fun invoke(id: Int) = repository.getEpisodes()

}