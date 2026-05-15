/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.dao;

import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

/**
 *
 * @author inaci
 */
public class CursoDAO {
    private EntityManagerFactory emf;

    public CursoDAO() {
        emf = Persistence.createEntityManagerFactory("desafio");
    }

    public void salvar(Curso curso) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(curso);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public List<Curso> listar() {
        EntityManager em = emf.createEntityManager();

        try {
            return em.createQuery("FROM Curso", Curso.class).getResultList();
        } finally {
            em.close();
        }
    }

    public void atualizar(Curso curso) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.merge(curso);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void remover(Long id) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            Curso curso = em.find(Curso.class, id);

            if (curso != null) {
                em.remove(curso);
            }

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Curso buscarPorId(Long id) {
        EntityManager em = emf.createEntityManager();

        try {
            return em.find(Curso.class, id);
        } finally {
            em.close();
        }
    }
}
