package io.github.aylesw.mch.backend.service;

import io.github.aylesw.mch.backend.dto.InjectionDto;
import io.github.aylesw.mch.backend.dto.VaccineStatisticsDetails;
import io.github.aylesw.mch.backend.dto.VaccineSuggestion;
import io.github.aylesw.mch.backend.entity.Vaccine;

import java.util.List;

public interface InjectionService {
    List<InjectionDto> getInjections(Long childId);

    void addInjection(Long childId, InjectionDto injectionDto);

    void updateInjection(Long childId, Long injectionId, InjectionDto injectionDto);

    void deleteInjection(Long childId, Long injectionId);

    List<Vaccine> getAllVaccines();

    void handleReaction(Long childId, Long injectionId, String reaction, String handling);

    List<InjectionDto> getSchedule();

    List<InjectionDto> getPendingRegistrations();

    void approveRegistration(Long injectionId);

    void rejectRegistration(Long injectionId, String reason);

    void addReaction(Long childId, Long injectionId, String reaction);

    void removeReaction(Long childId, Long injectionId, String reaction);

    List<VaccineStatisticsDetails> getVaccineStatistics(Integer month, Integer year);

    List<VaccineSuggestion> getVaccineSuggestions(Long childId);
}
