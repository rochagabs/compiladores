/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class ANivelUmExp extends PExp
{
    private PNivelUm _nivelUm_;

    public ANivelUmExp()
    {
        // Constructor
    }

    public ANivelUmExp(
        @SuppressWarnings("hiding") PNivelUm _nivelUm_)
    {
        // Constructor
        setNivelUm(_nivelUm_);

    }

    @Override
    public Object clone()
    {
        return new ANivelUmExp(
            cloneNode(this._nivelUm_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANivelUmExp(this);
    }

    public PNivelUm getNivelUm()
    {
        return this._nivelUm_;
    }

    public void setNivelUm(PNivelUm node)
    {
        if(this._nivelUm_ != null)
        {
            this._nivelUm_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nivelUm_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._nivelUm_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nivelUm_ == child)
        {
            this._nivelUm_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._nivelUm_ == oldChild)
        {
            setNivelUm((PNivelUm) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
