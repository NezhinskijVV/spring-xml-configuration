package ru.itsjava.service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProgrammerServiceImpl implements ProgrammerService{
    private final NotebookService notebookService;

    @Override
    public void printItems() {
        System.out.println("Мои товары = " + notebookService.getNotebook());
    }
}