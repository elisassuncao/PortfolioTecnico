private void botaoCadastraActionPerformed(java.awt.event.ActionEvent evt) {                                              
        String nome = campoNome.getText();
        String cpf = campoCpf.getText();
        String matricula = campoMatricula.getText();
        int idade = Integer.parseInt(campoIdade.getText());
        char sexo = ' ';
        if(radioM.isSelected()){
            sexo = 'm';
        }
        else if(radioF.isSelected()){
            sexo = 'f';
        }
        Aluno a = new Aluno(matricula);
        a.setNome(nome);
        a.setCpf(cpf);
        a.setIdade(idade);
        a.setSexo(sexo);
        jubileu.add(a);
        
        campoNome.setText(null);
        campoCpf.setText(null);
        campoMatricula.setText(null);
        campoIdade.setText(null);
        grupoSexo.clearSelection();
        JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
    }                                             

    private void botaoListaActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String mensagem = "Alunos\n";
        for(Aluno a : jubileu){
            mensagem += "Nome: "+a.getNome()+"\n";
            mensagem += "CPF: "+a.getCpf()+"\n";
            mensagem += "Matrícula: "+a.getMatricula()+"\n";
            mensagem += "Idade: "+a.getIdade()+"\n";
            mensagem += "Sexo: "+a.getSexo()+"\n";
            mensagem += "-------------------\n";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
